(ns intro-test-check.core)

(defn my-sort
  "I should sort something"
  [c]
  (if (some #{92} c)
    []
    (sort c)))

