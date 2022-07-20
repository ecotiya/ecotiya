﻿delete from ecotiya_com.m_section_title;
insert into ecotiya_com.m_section_title(section_kind_code,section_title,section_sub_title,remarks1,remarks2,show_flg) values 
    ('career','【経歴】','エンジニア人生を開始してから、今日までの歩みです。ぜひ、ご覧ください。',null,null,'1')
  , ('contact','【お問い合わせ】','ここまで、ご覧いただきありがとうございます。私への問い合わせは、下記フォームもしくはTwitterのDMをご利用ください。',null,null,'1')
  , ('profile','【私について】','エンジニア「ecotiya」のポートフォリオサイトです。あなたに、私のことを知ってもらうために、経歴・スキルをまとめています。気軽にご覧ください。','/assets/ecotiya.png','ecotiya','1')
  , ('skill','【スキルセット】','私のスキルセットを下記テーブルにまとめました。テーブルの表示内容は[経験年数 降順] [レベル 降順]でソートしており、レベル1の技術に関しては今後、強みとしていきたい、勉強中の技術です。',null,null,'1');
