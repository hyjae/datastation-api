package kr.datasolution.ds.api.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.Tuple;
import java.util.List;

@Repository
public interface WeatherDailyRepositoryCustom {
    List<Tuple> findByColumnName(List<String> columnNames, String from, String to);
}