/* Generated by: JJTree: Do not edit this line. ScalarTypeDefinition.java Version 1.1 */
/* ParserGeneratorCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.arcadedb.graphql.parser;

public class ScalarTypeDefinition extends TypeDefinition {

  protected Name       name;
  protected Directives directives;

  public ScalarTypeDefinition(int id) {
    super(id);
  }

  public ScalarTypeDefinition(GraphQLParser p, int id) {
    super(p, id);
  }

  public String getName() {
    return name != null ? name.value : null;
  }

  /**
   * Accept the visitor.
   **/
  public Object jjtAccept(GraphQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* ParserGeneratorCC - OriginalChecksum=6e8b3a7ca60f3dcd59d75d4e9935e618 (do not edit this line) */
