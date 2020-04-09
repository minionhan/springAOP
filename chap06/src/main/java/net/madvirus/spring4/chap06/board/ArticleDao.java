package net.madvirus.spring4.chap06.board;

import net.madvirus.spring4.chap06.Article;

public interface ArticleDao {
	void insert(Article artilce);
	
	Article selectById(Integer id);

}
