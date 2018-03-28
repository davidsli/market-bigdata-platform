package com.hxqh.bigdata.ma.common;

/**
 * Created by Ocean lin on 2018/1/15.
 *
 * @author Lin
 */
public interface Constants {

    /**
     * Linux
     */
    String SPLIT_LABLE = "\\^";
    String FILE_PATH = "hdfs://spark1:9000/videos/";
    String FILE_SPLIT = "/";


//    /**
//     * Windows
//     */
//    String SPLIT_LABLE = "\\^";
//    String FILE_PATH = "E:\\";
//    String FILE_SPLIT = "\\";

    /**
     * 影视类别
     */
    String CATEGORY_MANDARIN = "国语";
    String CATEGORY_LOVE = "爱情";
    String CATEGORY_COMEDY = "喜剧";
    String CATEGORY_EUROPE = "欧洲";
    String CATEGORY_SCIENCE_FICTION = "科幻";
    String CATEGORY_FANTASY = "奇幻";
    String CATEGORY_SUSPENSE = "悬疑";
    String CATEGORY_USA = "美国";
    String CATEGORY_GOOD_REPUTATION = "口碑佳片";

    String CATEGORY_ACTION = "动作";
    String CATEGORY_WARFARE = "战争";
    String CATEGORY_ENGLISH = "英语";
    String CATEGORY_CHINESE = "华语";
    String CATEGORY_CINEMA = "院线";
    String CATEGORY_THRILLER = "惊悚";
    String CATEGORY_CRIME = "犯罪";
    String CATEGORY_GUN_BATTLE = "枪战";


    String HOST_SPARK3 = "spark3";
    Integer ES_PORT = 9300;
    String ES_PORT_STRING = "9200";

    String FILM_SPLIT_LABEL = ",";
    String FILM_SPLIT_SPACE = " ";


    Integer FILM_OFFSET_ACTOR = 9;
    Integer FILM_OFFSET_DIRECTOR = 3;
    Integer FILM_OFFSET_TITLE = 4;
    Integer FILM_OFFSET_PLAYNUM = 6;
    Integer FILM_OFFSET_SCORE = 7;
    Integer FILM_TOP_NUM = 10;


    String FILM_INDEX = "front_film";
    String FILM_TYPE = "film";


    String FILM_PLAYNUM = "film_playnum";
    String FILM_LABEL_PIE = "film_label_pie";
    String FILM_SCORE_NUM = "film_tit1e_score";
    String FILM_COMPANY = "film_tit1e_company";
    String FILM_ACTOR_PLAYNUM = "film_actor_playnum";
    String FILM_ACTOR_SCORE = "film_actor_score";
    String FILM_DIRECTOR_PLAYNUM = "film_director_playnum";
    String FILM_DIRECTOR_SCORE = "film_director_score";


    /**
     * soap
     */
    Integer SOAP_TOP_NUM = 10;

    String SOAP_PLAYNUM_INDEX = "front_soap_playnum";
    String SOAP_LABEL_PIE_INDEX = "front_soap_label_pie";
    String SOAP_SCORE_TITLE_INDEX = "front_soap_score_title";
    String SOAP_GUEST_INDEX = "front_soap_guest";
    String SOAP_GUEST_COMMENT_INDEX = "front_soap_guest_comment";


    String SOAP_PLAYNUM_TYPE = "soap_playnum";
    String SOAP_LABEL_PIE_TYPE = "soap_label_pie";
    String SOAP_SCORE_TITLE_TYPE = "soap_score_title";
    String SOAP_GUEST_TYPE = "soap_guest";
    String SOAP_GUEST_COMMENT_TYPE = "guest_comment";


    /**
     * variety
     */
    Integer VARIETY_TOP_NUM = 10;


    String VARIETY_PLAYNUM_INDEX = "front_variety_playnum";
    String VARIETY_LABEL_PIE_INDEX = "front_variety_label_pie";
    String VARIETY_GUEST_PALYNUM_INDEX = "front_variety_guest_playnum";

    String VARIETY_PLAYNUM_TYPE = "variety_playnum";
    String VARIETY_LABEL_PIE_TYPE = "variety_label_pie";
    String VARIETY_GUEST_PALYNUM_TYPE = "variety_guest_playnum";


    /**
     * book
     */
    Integer BOOK_TOP_NUM = 10;

    String BOOKS_ANALYSIS_INDEX = "front_book_index";
    String BOOKS_ANALYSIS_TYPE = "front_book_type";


    String BOOKS_COMMENT = "books_comment";
    String BOOKS_LABEL = "books_label";
    String BOOKS_PRESS = "books_press";


    /**
     * literature
     */
    Integer LITERATURE_TOP_NUM = 10;


    String LITERATURE_PLAYNUM_INDEX = "front_literature_title_clicknum";
    String LITERATURE_LABEL_PIE_INDEX = "front_literature_label_pie";
    String LITERATURE_LABEL_CLICKNUM_PIE_INDEX = "front_literature_label_clicknum_pie";
    String LITERATURE_COMMENT_TITLE_INDEX = "front_literature_comment_title";
    String LITERATURE_COMMENT_AUTHOR_INDEX = "front_literature_comment_author";
    String LITERATURE_CLICKNUM_AUTHOR_INDEX = "front_literature_clicknum_author";


    String LITERATURE_PLAYNUM_TYPE = "title_clicknum";
    String LITERATURE_LABEL_PIE_TYPE = "label_pie";
    String LITERATURE_LABEL_CLICKNUM_PIE_TYPE = "label_clicknum_pie";
    String LITERATURE_COMMENT_TITLE_TYPE = "comment_title";
    String LITERATURE_COMMENT_AUTHOR_TYPE = "comment_author";
    String LITERATURE_CLICKNUM_AUTHOR_TYPE = "clicknum_author";


}
