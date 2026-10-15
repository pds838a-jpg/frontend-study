# Javaの復習

授業で扱ったBeginner (1)・(2)のテーマを、小さなJavaプログラムで復習するためのフォルダーです。コード内の出力とコメントは韓国語を基本にし、説明は日本語でまとめています。授業の課題や解答を転載したものではありません。

## 実行方法

Java 21以降を用意し、このフォルダーで次のように実行します。

```text
javac Beginner1/*.java Beginner2/*.java
java -cp Beginner1 PrimitiveTypesAndIf
java -cp Beginner1 LoopsAndControlFlow
java -cp Beginner2 NestedLoop
java -cp Beginner2 ArrayBasics
```

各ファイルは独立しているので、Eclipseでは`src`としてこのフォルダーを取り込むか、`.java`ファイルをJavaプロジェクトにコピーして実行できます。パッケージ宣言と外部ライブラリーは使っていません。

## 学習内容

| フォルダー・ファイル | テーマ | 確認すること |
| --- | --- | --- |
| [Beginner1/PrimitiveTypesAndIf.java](Beginner1/PrimitiveTypesAndIf.java) | 基本データ型と`if` | 型ごとの値、条件の順番、`String`との違い |
| [Beginner1/LoopsAndControlFlow.java](Beginner1/LoopsAndControlFlow.java) | `for`・`while`・`break`・`continue` | 繰り返す回数、スキップと終了の違い |
| [Beginner2/NestedLoop.java](Beginner2/NestedLoop.java) | 二重ループ | 外側と内側のループ、行と列 |
| [Beginner2/ArrayBasics.java](Beginner2/ArrayBasics.java) | 配列 | 添字、`length`、値の更新、合計と平均 |

もう少し詳しい説明は[復習ノート](study-notes.md)にあります。

## 対応するZenn記事

- [基本型・if・繰り返し](https://zenn.dev/japan_pds838a/articles/java-beginner-primitives-condition-loops)
- [二重ループ・配列](https://zenn.dev/japan_pds838a/articles/java-beginner-nested-loops-arrays)

## 参考

- 授業で扱ったBeginner (1)・(2)のテーマ。授業資料の本文や解答例は転載していません。
- [Oracle Java Tutorials: Language Basics](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/)
