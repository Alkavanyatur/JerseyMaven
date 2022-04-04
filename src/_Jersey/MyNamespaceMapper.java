package _Jersey;
/**
 * 
 */
import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;


@SuppressWarnings("restriction")
public class MyNamespaceMapper extends NamespacePrefixMapper {

  private static final String FOO_PREFIX = "ds";
  private static final String FOO_URI = "http://www.w3.org/2000/09/xmldsig#";

  private static final String BAR_PREFIX = "xsi";
  private static final String BAR_URI = "http://www.w3.org/2001/XMLSchema-instance";
  
  private static final String SCH_PREFIX = "schemaLocation";
  private static final String SCH_URI = "urn:ticketbai:emision ticketBaiV1-2.xsd ";

  @Override
  public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
      if(FOO_URI.equals(namespaceUri)) {
          return FOO_PREFIX;
      } else if(BAR_URI.equals(namespaceUri)) {
          return BAR_PREFIX;
      } else if(SCH_URI.equals(namespaceUri)) {
          return SCH_PREFIX;
      }
      return suggestion;
  }

  @Override
  public String[] getPreDeclaredNamespaceUris() {
      return new String[] { FOO_URI, BAR_URI, SCH_URI };
  }

}
