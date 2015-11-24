(fn f [n] (if (= 1 n) 
             [n] 
             (let [prev (f (dec n))] (map #(+ (nth prev % 0) (nth prev (dec %) 0)) (range n)))))
