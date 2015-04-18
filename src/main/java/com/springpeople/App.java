
- delta deployments or continuous deployments??

---

[root@localhost docker]# ls -F
containers/    execdriver/  init/         repositories-devicemapper  trust/
devicemapper/  graph/       linkgraph.db  tmp/                       volumes/
[root@localhost docker]#


---

TODO: 
security is there - how to do it? for Rev-up 


----

data containers, volumes, 


----

SOA Nodes:

ora-test33-fmwsoax-a1.vmware.com
ora-test33-fmwsoax-a2.vmware.com

OSB Nodes:

Ora-test33-osb-a1.vmware.com
Ora-test33-osb-a2.vmware.com


---

from prab (privately):
http://docs.docker.com/installation/ubuntulinux/
from prab (privately):
2.6.18-398.0.0.0.1.el5
from prasad waghodkar (privately):
2.6.18-398.0.0.0.1.el5

from prasad waghodkar (privately):
Required : 3.10.0-123.20.1.el7.x86_64


--

dock-soa-1

[root@dock-soa-1 docker]# docker search artfact-repo.vmware.com/vmware

mpindiprolu@dock-soa-1 docker]$ sudo docker push artfact-repo.vmware.com/vmware/java:1.0

http://artfact-repo.vmware.com:8081/artifactory/webapp/browserepo.html?2

wiki - http://webteam.vmware.com/wiki/index.php/Docker_Project

sudo docker search artfact-repo.vmware.com/middleware

artfact-repo.vmware.com/middleware


Software location - /dev/shm

chmod -R 777 shm

--

access problem for nirmata ; ports 7001 and 7002

---

- Gouda does not have VM access
- all users does not have sudo access ; its working for pradeep
- osb installation is already done
- 
- verify the admin and console for installation
- 

OSB Console access  - working with network team for port acces
Start the admin server and check the health
supervisord - starting Manged server 
Deploy the app and test from SOAP UI.
Nirmata exploration - if time permits 
priorities



https://nirmata.io/webclient/

credentials: shanumanthu@vmware.com /welcome1



http://10.148.254.30:7001/console


local repo for the docker centos while running the 

docker inspect $CID | grep IPAddress | cut -d '"' -f 4
from Sivananda Hanumanthu (internal) to Everyone:
http://stackoverflow.com/questions/17157721/getting-a-docker-containers-ip-address-from-the-host



---

http://dock-soa-1.vmware.com:7001/console
weblogic/welcome1
 
Artifactory: http://artfact-repo.vmware.com:8081/artifactory/webapp/browserepo.html?2
Nirmata: https://www.nirmata.io/webclient/#applications


