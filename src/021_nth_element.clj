(fn [list n] (if (= n 0) (first list) (recur (rest list) (dec n) )))

