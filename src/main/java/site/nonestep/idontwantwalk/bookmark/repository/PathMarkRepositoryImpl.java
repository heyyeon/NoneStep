package site.nonestep.idontwantwalk.bookmark.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PathMarkRepositoryImpl {

    @Autowired
    private JPAQueryFactory queryFactory;
}
