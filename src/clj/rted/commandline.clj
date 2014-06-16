(ns rted.commandline
  (:import [util RTEDCommandLine])
  (:gen-class))

(defn -main [& args]
  (-> (RTEDCommandLine.)
      (.runCommandLine (into-array String args))))