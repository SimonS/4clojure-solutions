(fn [& args] (reduce #(if (> %1 %2) %1 %2) args))

