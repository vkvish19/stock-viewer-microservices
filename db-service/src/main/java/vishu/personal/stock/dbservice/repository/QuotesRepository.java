package vishu.personal.stock.dbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vishu.personal.stock.dbservice.model.Quote;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {
    List<Quote> findByUserName(String username);
}
