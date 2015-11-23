(fn [& nums] (let [max-in (apply max nums)]
              (loop [x max-in
                     filtered []]
                (if (= (count filtered) (count nums))
                  (- x max-in)
                  (recur
                    (+ x max-in)
                    (filter #(= 0 (rem x %)) nums))))))
