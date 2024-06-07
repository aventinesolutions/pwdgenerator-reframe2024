(ns pwdgenerator-reframe2024.events
  (:require
   [re-frame.core :as re-frame]
   [pwdgenerator-reframe2024.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
