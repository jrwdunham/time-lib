(ns hello-time
  (:require [clj-time.core :as t]
            [clj-time.format :as f]))

(defn now
  []
  (t/now))

(defn time-str
  [dt]
  (f/unparse
    (f/with-zone (f/formatter "hh:mm aa") (t/default-time-zone))
    dt))
