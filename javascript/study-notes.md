# JavaScript 復習ノート

授業資料の15〜19フォルダーのテーマを、ブラウザーで確認できる例と対応させたノートです。学習者がすべての実習を完了したという記録ではありません。

## 15: スクリプトと入出力

HTMLは構造、CSSは見た目、JavaScriptは値の計算や操作に対する動きを担当します。外部ファイルなら `<script src="app.js" defer></script>` と書くと、HTMLの解析後に実行されます。ここでは仕組みを一つのファイルで読めるよう、`body` の末尾にスクリプトを置いています。

`console.log()` は開発者ツールへの出力、`alert()` は通知、`confirm()` は真偽値を返す確認、`prompt()` は文字列またはキャンセル時の `null` を返す入力です。入力フォームの `.value` も文字列です。今回のサンプルでは再実行しやすいフォームを使います。`document.write()` は読み込み後に使うと文書を書き換えることがあるため、結果の表示には `textContent` を使います。

## 16: 変数・型・演算・制御構文

再代入しない束縛は `const`、更新する変数は `let` を基本にします。`const` の配列・オブジェクトの中身は変更できます。`var` は関数スコープで、`let` と `const` はブロックスコープです。`let` と `const` は宣言前に読み出せません。単に「ホイスティングされない」と覚えるより、初期化前にアクセスできない領域があると理解します。

`"30" + 7` は `"307"`、`Number("30") + 7` は `37` です。`Number("")` は0になるため、空欄を先に確認します。`NaN` は数として計算できない結果で、`Number.isFinite()` なら `NaN` と無限大を除外できます。厳密等価の `===` は型変換をせず比較します。

- `&&`: 両方の条件を満たす。`||`: 少なくとも一方を満たす。`!`: 真偽を反転。一般には `&&` と `||` は真偽値以外のオペランドも返します。
- `if / else if / else`: 上から条件を判定。`switch`: 値に対応する分岐。`break` を省くと次の節へ進む場合があります。
- `for`: 初期化・継続条件・更新。`while`: 先に条件確認。`do...while`: 本体を少なくとも一度実行。
- `break`: 最も内側の対象ループなどを終了。`continue`: 現在の反復の残りを飛ばす。
- 二重ループ: 外側1回につき内側が一巡。配列の最終インデックスは `length - 1`。

対応: 01〜03。範囲の境界、空欄、0を試すと分岐の間違いを発見しやすくなります。

## 17: 関数・スコープ・イベント

関数は入力を受けて処理をまとめます。呼び出しで渡す実際の値が引数、定義で受け取る名前が仮引数です。`return` は関数を終了して値を返します。`return` のない関数の戻り値は `undefined` です。画面への表示や `console.log()` と、戻り値は別です。

関数宣言、匿名関数を変数に入れる関数式、アロー関数、定義直後に呼び出す即時実行関数を04で比べます。アロー関数は独自の `this` を持たないため、すべての通常関数を置き換えられるわけではありません。`addEventListener("click", handler)` には関数を渡し、`handler()` とその場で実行しないよう注意します。

## 18: オブジェクト・配列・組み込み機能

オブジェクトは名前付きのプロパティを持ち、関数のプロパティはメソッドとして使えます。配列は0から始まるインデックスで値を取り出します。

| 操作 | 元の配列 | 戻り値など |
| --- | --- | --- |
| `push(value)` | 末尾に追加 | 新しい長さ |
| `pop()` | 末尾を削除 | 削除した値。空なら `undefined` |
| `splice(start, count)` | 指定範囲を削除 | 削除した値の配列 |
| `slice()` | 変更しない | 浅いコピー |
| `concat(other)` | 変更しない | 結合した新しい配列 |
| `join(", ")` | 変更しない | 文字列 |
| `forEach(callback)` | コールバック次第 | 各要素に処理を実行 |

浅いコピーでは、要素がオブジェクトならその参照は共有されます。05は文字列の配列なので、この違いを混ぜずに操作を確認できます。

`Date` は日時を扱い、`getMonth()` は0〜11を返します。`Math.floor(Math.random() * 6) + 1` は1〜6の整数を作ります。暗号や抽選の公正さが必要な処理のための例ではありません。

`window` はブラウザーのウィンドウ、`location` は現在のURL、`screen` は画面に関する情報を扱います。画面幅と表示領域の幅は別です。`window.open()` のポップアップはブラウザーに制限される場合があり、教材どおりでも開けないことがあります。今回の例では新しいウィンドウを開きません。

`setTimeout()` は一度、`setInterval()` は繰り返しの実行を予約します。戻り値のIDを保存して `clearTimeout()` / `clearInterval()` で取り消します。遅延値は正確な実行時刻の保証ではありません。06ではタイマーの重複登録を防いでいます。

## 19: DOM・イベント・要素の生成

DOMはHTML文書をオブジェクトの木として扱う仕組みです。`querySelector()` は最初の一致要素、`querySelectorAll()` は一致要素の静的な `NodeList` を返します。見つからない場合、前者は `null`、後者は空の一覧です。

`textContent` は文字列、`innerHTML` はHTMLとして解釈する内容を設定します。入力された文章は `textContent` で表示します。`classList.add/remove/toggle` でCSSクラスを操作できます。属性は `getAttribute/setAttribute`、個別スタイルは `element.style` でも扱えます。

イベントの `target` は発生元、`currentTarget` は実行中のリスナーが登録された要素です。子要素をクリックすると異なる場合があります。フォームの `submit` で `preventDefault()` を呼ぶと標準の送信を止められます。Enterキーでも同じ処理を使えるよう、08はボタンの `click` ではなくフォームの `submit` を扱います。

`createElement()` → `textContent` → `append()` で要素を作って追加し、`remove()` で取り除きます。08では空白を除いた入力を確認し、要素ごとに完了ボタン・削除ボタンを付けます。保存機能はなく、再読み込みでリセットされます。

## 復習問題

1. `const items = []; items.push("JS");` はなぜ実行できるか。
2. 空欄を `Number()` で変換する前に確認する理由は何か。
3. `return` と `console.log()` の違いは何か。
4. `break` と `continue` はどこまで処理を飛ばすか。
5. 入力欄の `<b>JS</b>` をそのまま表示するには何を使うか。

答え: 1は束縛の再代入ではなく配列の変更だから。2は空文字列が0になるから。3は呼び出し元へ値を返す操作とコンソール出力の違い。4は対象ループの終了と現在の反復の残りのスキップ。5は `textContent`。

## 参考資料

- [MDN: 文法とデータ型](https://developer.mozilla.org/ja/docs/Web/JavaScript/Guide/Grammar_and_types)
- [MDN: 関数](https://developer.mozilla.org/ja/docs/Web/JavaScript/Guide/Functions)
- [MDN: Array](https://developer.mozilla.org/ja/docs/Web/JavaScript/Reference/Global_Objects/Array)
- [MDN: addEventListener](https://developer.mozilla.org/ja/docs/Web/API/EventTarget/addEventListener)
- [MDN: textContent](https://developer.mozilla.org/ja/docs/Web/API/Node/textContent)
