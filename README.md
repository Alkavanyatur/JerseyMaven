# JerseyMaven
Jersey concept. TBAI XML. Adding namespace to the first node and removing on the child node.

The sample code adds the namespace "T" to the header and also the attributes on the header.
Also adds the others nodes without namespace (Using namespace="").
Reads the sampleXML pass it throught an object and prints it again.

This is the sample:

```
<?xml version="1.0" encoding="UTF-8"?>
<T:TicketBai xmlns:T="urn:ticketbai:emision" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="urn:ticketbai:emision ticketBaiV1-2.xsd ">
   <Cabecera>
      testXML
   </Cabecera>
</T:TicketBai>
```
