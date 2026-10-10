# JavaScriptの復習

HTML・CSSに続いて、授業で使用した `doit-hcj-new` の15〜19フォルダーにあるテーマを整理しました。変数と制御構文から、関数・配列・オブジェクト、DOMとイベントへ進みます。

元の教材には未記入の練習ファイルもあります。このフォルダーは完成済みの課題をそのまま公開したものではなく、テーマをもとにAIの支援で作成した復習用の小さな例です。説明は日本語、コード内の表示文・コメントは韓国語を基本にしています。学習者本人の実行結果や理解度を示すものではありません。

## 実行方法

リポジトリをダウンロードして、[index.html](index.html) をブラウザーで開きます。インストールやビルドは不要です。`style.css` も同じフォルダーに保存してください。各ページは独立して動きます。

## 学習内容

| ファイル | テーマ | 確認すること |
| --- | --- | --- |
| [01](01-values-and-input.html) | `let`・`const`、型、入力値 | 30分×7日＝210分。空欄と範囲外を拒否 |
| [02](02-conditions.html) | `if`・`switch`、比較、論理演算 | 59/60/79/80で分岐が変わる |
| [03](03-loops.html) | `for`・`while`・`do...while`、二重ループ | 合計55、`break` と `continue` の違い |
| [04](04-functions-and-scope.html) | 関数宣言・関数式・アロー関数・即時実行・スコープ | 引数、戻り値、ブロック内外の変数 |
| [05](05-arrays-and-objects.html) | 配列、要素の追加・削除・コピー、オブジェクト | 元の配列を変更する操作とコピーする操作 |
| [06](06-date-math-browser.html) | `Date`・`Math`、タイマー、ブラウザーの情報 | 月は+1、乱数は1〜6、開始の連打と停止 |
| [07](07-dom-and-events.html) | 要素の選択、イベント、テキスト、クラス | 入力したタグを文字として表示 |
| [08](08-study-list.html) | フォーム、要素の生成・追加・削除 | 空白入力の拒否、完了の切替、削除、件数 |

詳しい説明と復習問題は [study-notes.md](study-notes.md) にあります。
サンプルの確認結果は [verification.md](verification.md) に記録しています。

## Zennの記事

- [constなのに配列へ追加できる？](https://zenn.dev/japan_pds838a/articles/javascript-basics-types-control)
- [クリックイベントに渡す関数と、実行する関数](https://zenn.dev/japan_pds838a/articles/javascript-dom-events-study-list)

## 実習の進め方

最初に出力を予想し、実行した結果と比較します。次に値を一つ変更して、なぜ結果が変わったかを自分の言葉で説明します。08の一覧はページ内だけのデータなので、再読み込みすると消えます。

## 参考

- 授業で使用した `doit-hcj-new` の15〜19フォルダー。教材の原本・画像・解答一式は転載していません。
- [MDN: JavaScriptガイド](https://developer.mozilla.org/ja/docs/Web/JavaScript/Guide)
- [MDN: DOMの紹介](https://developer.mozilla.org/ja/docs/Web/API/Document_Object_Model/Introduction)
