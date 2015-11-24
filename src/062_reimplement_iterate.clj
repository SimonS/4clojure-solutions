(fn it [f x] (cons x (lazy-seq (it f (f x)))))

