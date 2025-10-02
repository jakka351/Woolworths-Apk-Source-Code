package io.noties.markwon.html;

import android.support.v4.media.session.a;
import io.noties.markwon.html.HtmlTag;

/* loaded from: classes7.dex */
abstract class HtmlTagImpl implements HtmlTag {

    public static class BlockImpl extends HtmlTagImpl implements HtmlTag.Block {
        public final String toString() {
            return "BlockImpl{name='" + ((String) null) + "', start=0, end=0, attributes=" + ((Object) null) + ", parent=" + ((String) null) + ", children=" + ((Object) null) + '}';
        }
    }

    public static class InlineImpl extends HtmlTagImpl implements HtmlTag.Inline {
        public final String toString() {
            StringBuilder sb = new StringBuilder("InlineImpl{name='");
            sb.append((String) null);
            sb.append("', start=");
            sb.append(0);
            sb.append(", end=");
            sb.append(0);
            sb.append(", attributes=");
            return a.u(sb, null, '}');
        }
    }
}
