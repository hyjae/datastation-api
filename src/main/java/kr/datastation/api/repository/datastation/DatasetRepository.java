package kr.datastation.api.repository.datastation;


import kr.datastation.api.entity.datastation.Dataset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DatasetRepository extends JpaRepository<Dataset, Long>, DatasetRepositoryCustom {
    // TODO: full text search
    List<DatasetCustomView> findByDsDescContainingOrDsKeywordContaining(String desc, String keyword);

    List<DatasetCustomView> findTop10ByOrderByUpdateDdttDesc();

    List<DatasetCustomView> findTop10ByOrderByDownloadCountDesc();
}
