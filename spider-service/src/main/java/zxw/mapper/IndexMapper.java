package zxw.mapper;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zxw.pojo.Caca;

/**
 * @author zxw
 * @date 2019/11/25 20:42
 */
@Repository
public interface IndexMapper extends MongoRepository<Caca, String> {
}
