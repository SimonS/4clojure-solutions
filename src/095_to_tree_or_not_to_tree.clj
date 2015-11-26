(fn isTree? [tree] (and
            (= (count tree) 3)
            (every? #(or (and (sequential? %) (isTree? %)) (nil? %)) (rest tree))))
