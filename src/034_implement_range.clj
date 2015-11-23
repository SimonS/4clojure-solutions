#((fn [agg] (if (= (inc (last agg)) %2) agg (recur (conj agg (inc (last agg)))))) [%1])

