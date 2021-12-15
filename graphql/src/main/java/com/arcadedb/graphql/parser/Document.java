/* Generated by: JJTree: Do not edit this line. Document.java Version 1.1 */
/* ParserGeneratorCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.arcadedb.graphql.parser;

import java.util.*;

public class Document extends SimpleNode {

  protected List<Definition> definitions = new ArrayList<>();

  public Document(int id) {
    super(id);
  }

  public Document(GraphQLParser p, int id) {
    super(p, id);
  }

  /**
   * Accept the visitor.
   **/
  public Object jjtAccept(GraphQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public List<Definition> getDefinitions() {
    return definitions;
  }
}
/* ParserGeneratorCC - OriginalChecksum=8ab9229334dc0c8cb1aec80c77abf8f6 (do not edit this line) */
