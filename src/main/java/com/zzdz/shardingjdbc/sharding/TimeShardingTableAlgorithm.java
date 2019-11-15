package com.zzdz.shardingjdbc.sharding;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

/**
 * 精确分片算法
 */
public class TimeShardingTableAlgorithm implements PreciseShardingAlgorithm<Long> {

    /**
     * 根据分片键传入的值生成 物理表的后缀名
     * @param collection
     * @param preciseShardingValue
     * @return
     */
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        String logicTableName = preciseShardingValue.getLogicTableName();
        Long value = preciseShardingValue.getValue();
        String yearAndMonth = getYearAndMonthAndDay(value);

        StringBuffer tableName = new StringBuffer();
        tableName.append(logicTableName)
                .append("_")
                .append(yearAndMonth);

        return tableName.toString();
    }

    /**
     *
     * @param shardingKey
     * @return
     */
    public static String getYearAndMonthAndDay(long shardingKey){
        DateTimeFormatter yearAndMonthAndDay =  DateTimeFormatter.ofPattern("yyyyMMddHHmm");

        Instant instant =  Instant.ofEpochSecond(shardingKey);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return  yearAndMonthAndDay.format(localDateTime);
    }
}
