#(= % ((fn rev [[value left right :as node]] (if node [value (rev right) (rev left)])) %))
