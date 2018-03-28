# Spring Boot 研修用アプリケーション

Spring Boot の研修用のリポジトリです。

## Agenda

1. 今回の研修の概要
1. Spring Framework / Spring Boot について
1. 研修でやる内容
1. 研修の進め方
1. ハンズオン
1. ふりかえり

## 研修の概要

Spring Boot を使った簡単な Web アプリケーションを作成していきます。  
ブラウザから操作し、DB への CRUD をしていくシンプルなものです。  

## この研修で使うもの

### 言語

- Java 8

### ソース管理

- Git
    - GitHub(ホスティングサービス)

### ビルドツール

- Maven

### フレームワーク

- Spring Framework
- doma2(DBアクセスフレームワーク)

### DB

- H2DB (Embed)

## Spring Boot とは

"Spring Boot" とは "Spring Framework" という Java のフレームワークで、アプリケーションを簡単に作るための仕組みです。

Spring Framework には様々なプロダクト（機能）がありますが、広い範囲をカバーしている反面、そのプロダクトを知らない人にとっては、多すぎて取っ付きにくいところもあります。

また、それを組み合わせて使うには多くの設定が必要だったりその組み合わせ方法もノウハウが必要でした。

そこで現れたのが "Spring Boot" です。

"Spring Boot" は

- あらかじめオススメのプロジェクトの組み合わせが含まれている。
- 自動で設定が有効になる
- 組み込みサーバが同梱される

といった特徴を持ち、コードを少量書いてすぐに実行（起動）可能にします。

"Spring Boot" はWebアプリケーションに特化しているわけではありません。
コマンドラインアプリケーションやバッチアプリケーションにも使えます。

もう少し詳しい説明はこっち
https://www.ibm.com/developerworks/jp/java/library/j-spring-boot-basics-perry/

## 環境設定

#### IDE

STS(Spring Tool Suite™)を使用します。  
https://spring.io/tools/sts/all からダウンロードして任意の場所に展開しましょう。

#### ソース管理

Git(GitHub)を使用します。  
PortableGit をダウンロードして任意の場所に展開しましょう。  
https://github.com/git-for-windows/git/releases/latest  
  
展開したら、以下をPATHを設定しましょう。
```
{展開したフォルダ}/cmd
```

#### Git の設定

Gitの設定をします。
```
> git config xxx
```

#### 雛形のダウンロード

GitHubから雛形をダウンロードします。
```
> git clone https://github.com/dev-study-si-mf/spring-practice.git
```

#### Git のブランチ設定

ブランチを切ります。任意の名前でOKですが、かぶらないようにしないといけません。
```
> git branch {branch-name}
```
作ったブランチに移動します。
```
> git checkout {branch-name}
```
移動したことを確認します。
```
> git branch
  master
* {branch-name} <- * が付いてるところが作業中のブランチ
```

## 実装
1. 作りものを整理しよう
1. DBアクセスする機能を作ろう
	1. 情報を取得するSQLを書こう
	1. SQLを検証しよう
	1. Entity クラスを作ろう
	1. Dao クラスを作ろう
1. ビジネスロジックを書こう
	1. Serviceクラスを書こう
	1. トランザクションについて考えよう
1. コントローラ層を作ろう
	1. チェック処理どうやってる
	1. ビジネスロジックを呼び出そう
1. ビューを見てみよう
	1. Thymeleaf の紹介
1. 応用
	1. 新たな機能を作ってみよう

## 参照

Spring Boot https://projects.spring.io/spring-boot/  
doma2 https://doma.readthedocs.io/ja/stable/  
h2db http://www.h2database.com/html/main.html  
maven https://maven.apache.org/  

### メモ

- H２DBコンソール
    - http://localhost:8080/h2-console/
