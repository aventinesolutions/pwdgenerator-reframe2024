(ns pwdgenerator-reframe2024.views
  (:require
   [re-frame.core :as re-frame]
   [pwdgenerator-reframe2024.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      "Hello from " @name]
     ]))
