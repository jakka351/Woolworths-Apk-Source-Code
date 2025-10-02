package com.halilibo.richtext.commonmark;

import com.halilibo.richtext.markdown.node.AstBlockQuote;
import com.halilibo.richtext.markdown.node.AstCode;
import com.halilibo.richtext.markdown.node.AstDocument;
import com.halilibo.richtext.markdown.node.AstEmphasis;
import com.halilibo.richtext.markdown.node.AstFencedCodeBlock;
import com.halilibo.richtext.markdown.node.AstHardLineBreak;
import com.halilibo.richtext.markdown.node.AstHeading;
import com.halilibo.richtext.markdown.node.AstHtmlBlock;
import com.halilibo.richtext.markdown.node.AstHtmlInline;
import com.halilibo.richtext.markdown.node.AstImage;
import com.halilibo.richtext.markdown.node.AstIndentedCodeBlock;
import com.halilibo.richtext.markdown.node.AstLink;
import com.halilibo.richtext.markdown.node.AstLinkReferenceDefinition;
import com.halilibo.richtext.markdown.node.AstListItem;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.markdown.node.AstNodeLinks;
import com.halilibo.richtext.markdown.node.AstNodeType;
import com.halilibo.richtext.markdown.node.AstOrderedList;
import com.halilibo.richtext.markdown.node.AstParagraph;
import com.halilibo.richtext.markdown.node.AstSoftLineBreak;
import com.halilibo.richtext.markdown.node.AstStrikethrough;
import com.halilibo.richtext.markdown.node.AstStrongEmphasis;
import com.halilibo.richtext.markdown.node.AstTableBody;
import com.halilibo.richtext.markdown.node.AstTableCell;
import com.halilibo.richtext.markdown.node.AstTableCellAlignment;
import com.halilibo.richtext.markdown.node.AstTableHeader;
import com.halilibo.richtext.markdown.node.AstTableRoot;
import com.halilibo.richtext.markdown.node.AstTableRow;
import com.halilibo.richtext.markdown.node.AstText;
import com.halilibo.richtext.markdown.node.AstThematicBreak;
import com.halilibo.richtext.markdown.node.AstUnorderedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.Document;
import org.commonmark.node.Emphasis;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Image;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.Link;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.ListItem;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.Paragraph;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Text;
import org.commonmark.node.ThematicBreak;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-commonmark_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AstNodeConvertKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16240a;

        static {
            int[] iArr = new int[TableCell.Alignment.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16240a = iArr;
        }
    }

    public static final AstNode a(Node node, AstNode astNode, AstNode astNode2) {
        AstNodeType astStrikethrough;
        String str;
        AstNodeType astLinkReferenceDefinition;
        if (node == null) {
            return null;
        }
        AstNodeLinks astNodeLinks = new AstNodeLinks();
        astNodeLinks.f16261a = astNode;
        astNodeLinks.b = null;
        astNodeLinks.c = null;
        astNodeLinks.d = astNode2;
        astNodeLinks.e = null;
        if (node instanceof BlockQuote) {
            astStrikethrough = AstBlockQuote.f16246a;
        } else {
            char cCharAt = 0;
            cCharAt = 0;
            char cCharAt2 = 0;
            cCharAt = 0;
            if (node instanceof BulletList) {
                BulletList bulletList = (BulletList) node;
                String str2 = bulletList.h;
                if (str2 != null && !str2.isEmpty()) {
                    cCharAt2 = bulletList.h.charAt(0);
                }
                astStrikethrough = new AstUnorderedList(cCharAt2);
            } else if (node instanceof Code) {
                String str3 = ((Code) node).g;
                Intrinsics.g(str3, "getLiteral(...)");
                astStrikethrough = new AstCode(str3);
            } else if (node instanceof Document) {
                astStrikethrough = AstDocument.f16248a;
            } else if (node instanceof Emphasis) {
                String str4 = ((Emphasis) node).g;
                Intrinsics.g(str4, "getOpeningDelimiter(...)");
                astStrikethrough = new AstEmphasis(str4);
            } else if (node instanceof FencedCodeBlock) {
                FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                String str5 = fencedCodeBlock.l;
                Intrinsics.g(str5, "getLiteral(...)");
                String str6 = fencedCodeBlock.g;
                char cCharAt3 = (str6 == null || str6.isEmpty()) ? (char) 0 : fencedCodeBlock.g.charAt(0);
                int i = fencedCodeBlock.j;
                Integer num = fencedCodeBlock.h;
                int iIntValue = num != null ? num.intValue() : 0;
                String str7 = fencedCodeBlock.k;
                Intrinsics.g(str7, "getInfo(...)");
                astStrikethrough = new AstFencedCodeBlock(cCharAt3, iIntValue, i, str7, str5);
            } else if (node instanceof HardLineBreak) {
                astStrikethrough = AstHardLineBreak.f16251a;
            } else if (node instanceof Heading) {
                astStrikethrough = new AstHeading(((Heading) node).g);
            } else if (node instanceof ThematicBreak) {
                astStrikethrough = AstThematicBreak.f16273a;
            } else if (node instanceof HtmlInline) {
                String str8 = ((HtmlInline) node).g;
                Intrinsics.g(str8, "getLiteral(...)");
                astStrikethrough = new AstHtmlInline(str8);
            } else if (node instanceof HtmlBlock) {
                String str9 = ((HtmlBlock) node).g;
                Intrinsics.g(str9, "getLiteral(...)");
                astStrikethrough = new AstHtmlBlock(str9);
            } else {
                if (node instanceof Image) {
                    Image image = (Image) node;
                    String str10 = image.g;
                    if (str10 != null) {
                        String str11 = image.h;
                        astLinkReferenceDefinition = new AstImage(str11 != null ? str11 : "", str10);
                        astStrikethrough = astLinkReferenceDefinition;
                    }
                    astStrikethrough = null;
                } else if (node instanceof IndentedCodeBlock) {
                    String str12 = ((IndentedCodeBlock) node).g;
                    Intrinsics.g(str12, "getLiteral(...)");
                    astStrikethrough = new AstIndentedCodeBlock(str12);
                } else if (node instanceof Link) {
                    Link link = (Link) node;
                    String str13 = link.h;
                    str = str13 != null ? str13 : "";
                    String str14 = link.g;
                    Intrinsics.g(str14, "getDestination(...)");
                    astStrikethrough = new AstLink(str14, str);
                } else if (node instanceof ListItem) {
                    astStrikethrough = AstListItem.f16259a;
                } else if (node instanceof OrderedList) {
                    OrderedList orderedList = (OrderedList) node;
                    Integer num2 = orderedList.i;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    String str15 = orderedList.h;
                    if (str15 != null && !str15.isEmpty()) {
                        cCharAt = orderedList.h.charAt(0);
                    }
                    astStrikethrough = new AstOrderedList(iIntValue2, cCharAt);
                } else if (node instanceof Paragraph) {
                    astStrikethrough = AstParagraph.f16263a;
                } else if (node instanceof SoftLineBreak) {
                    astStrikethrough = AstSoftLineBreak.f16264a;
                } else if (node instanceof StrongEmphasis) {
                    String str16 = ((StrongEmphasis) node).g;
                    Intrinsics.g(str16, "getOpeningDelimiter(...)");
                    astStrikethrough = new AstStrongEmphasis(str16);
                } else if (node instanceof Text) {
                    String str17 = ((Text) node).g;
                    Intrinsics.g(str17, "getLiteral(...)");
                    astStrikethrough = new AstText(str17);
                } else if (node instanceof LinkReferenceDefinition) {
                    LinkReferenceDefinition linkReferenceDefinition = (LinkReferenceDefinition) node;
                    String str18 = linkReferenceDefinition.i;
                    str = str18 != null ? str18 : "";
                    String str19 = linkReferenceDefinition.h;
                    Intrinsics.g(str19, "getDestination(...)");
                    String str20 = linkReferenceDefinition.g;
                    Intrinsics.g(str20, "getLabel(...)");
                    astLinkReferenceDefinition = new AstLinkReferenceDefinition(str20, str19, str);
                    astStrikethrough = astLinkReferenceDefinition;
                } else if (node instanceof TableBlock) {
                    astStrikethrough = AstTableRoot.f16270a;
                } else if (node instanceof TableHead) {
                    astStrikethrough = AstTableHeader.f16269a;
                } else if (node instanceof TableBody) {
                    astStrikethrough = AstTableBody.f16267a;
                } else if (node instanceof TableRow) {
                    astStrikethrough = AstTableRow.f16271a;
                } else if (node instanceof TableCell) {
                    TableCell tableCell = (TableCell) node;
                    boolean z = tableCell.g;
                    TableCell.Alignment alignment = tableCell.h;
                    int i2 = alignment == null ? -1 : WhenMappings.f16240a[alignment.ordinal()];
                    AstTableCellAlignment astTableCellAlignment = (i2 == -1 || i2 == 1) ? AstTableCellAlignment.d : i2 != 2 ? i2 != 3 ? AstTableCellAlignment.d : AstTableCellAlignment.f : AstTableCellAlignment.e;
                    astStrikethrough = new AstTableCell(z, astTableCellAlignment);
                } else if (node instanceof Strikethrough) {
                    String str21 = ((Strikethrough) node).g;
                    Intrinsics.g(str21, "getOpeningDelimiter(...)");
                    astStrikethrough = new AstStrikethrough(str21);
                } else {
                    astStrikethrough = null;
                }
            }
        }
        AstNode astNode3 = astStrikethrough != null ? new AstNode(astStrikethrough, astNodeLinks) : null;
        if (astNode3 != null) {
            AstNodeLinks astNodeLinks2 = astNode3.b;
            astNodeLinks2.b = a(node.b, astNode3, null);
            astNodeLinks2.e = a(node.e, astNode, astNode3);
        }
        if (node.e == null && astNode != null) {
            astNode.b.c = astNode3;
        }
        return astNode3;
    }
}
