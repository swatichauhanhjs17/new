(ns aform.events
  (:require
   [re-frame.core :as re-frame]
   [aform.db :as db]
))

   (re-frame/reg-event-db
     :submit
      (fn [db _]
       (assoc db :result "FORM SUBMITTED")))


(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
