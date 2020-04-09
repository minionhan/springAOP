package net.madvirus.spring4.chap06.board;

import java.util.HashMap;
import java.util.Map;

import net.madvirus.spring4.chap06.Article;
import net.madvirus.spring4.chap06.board.ArticleDao;

public class MemoryArticleDao implements ArticleDao{
	private int articleNo=0;
	private Map<Integer, Article> articleMap = new HashMap<Integer, Article>();
	public void insert(Article artilce) {
		System.out.println("MemoryArticleDao.insert()호출됨");
		articleNo++;
		artilce.setId(articleNo);
		articleMap.put(articleNo, artilce);
		
	}
	public Article selectById(Integer id) {
		return articleMap.get(id);
	}
	
	

}
