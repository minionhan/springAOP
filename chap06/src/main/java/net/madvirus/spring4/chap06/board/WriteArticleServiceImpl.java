package net.madvirus.spring4.chap06.board;

import net.madvirus.spring4.chap06.Article;

public class WriteArticleServiceImpl implements WriteArticleService{
	private ArticleDao articleDao;
	public WriteArticleServiceImpl(ArticleDao articleDao){
		this.articleDao = articleDao;
	}
	public void write(NewArticleRequest newArticleReq){
		System.out.println("WriteArticleServiceImpl.wirte() 호출됨");
		Article article = toArticle(newArticleReq);
		articleDao.insert(article);
	}
	public Article toArticle(NewArticleRequest newArticleReq){
		return new Article(
				newArticleReq.getWriterName(),
				newArticleReq.getTitle(),
				newArticleReq.getContent());
	}

}
