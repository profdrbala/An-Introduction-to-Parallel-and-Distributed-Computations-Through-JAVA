/*
* RestfullHello stub
*/

function RestfullHello() {}

function RestfullHello(uri_) {
    this.uri = uri_;
}

RestfullHello.prototype = {

   uri : 'http://localhost:30888/RestfullHello/resources',

   resources : new Array(),
   
   initialized : false,

   getUri : function() {
      return this.uri;
   },

   getResources : function() {
      if(!this.initialized)
          this.init();
      return this.resources;
   },

   init : function() {

      this.initialized = true;
   },

   flush : function(resources_) {
      for(j=0;j<resources_.length;j++) {
        var r = resources_[j];
        r.flush();
      }
   },
   
   getProxy : function() {
       return rjsSupport.getHttpProxy();
   },
   
   setProxy : function(proxy_) {
       rjsSupport.setHttpProxy(proxy_);
   },

   toString : function() {
      var s = '';
      for(j=0;j<this.resources.length;j++) {
        var c = this.resources[j];
        if(j<this.resources.length-1)
            s = s + '{"@uri":"'+c.getUri()+'"},';
        else
            s = s + '{"@uri":"'+c.getUri()+'"}';
      }
      var myObj = 
         '{"resources":'+
         '{'+
         s+
         '}'+
      '}';
      return myObj;
   }

}
