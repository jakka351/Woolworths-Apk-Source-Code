package androidx.compose.ui.text;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Clickable", "Url", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class LinkAnnotation implements AnnotatedString.Annotation {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "Landroidx/compose/ui/text/LinkAnnotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Clickable extends LinkAnnotation {

        /* renamed from: a, reason: collision with root package name */
        public final String f2043a;
        public final TextLinkStyles b;
        public final LinkInteractionListener c;

        public Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            this.f2043a = str;
            this.b = textLinkStyles;
            this.c = linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        /* renamed from: a, reason: from getter */
        public final LinkInteractionListener getC() {
            return this.c;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        /* renamed from: b, reason: from getter */
        public final TextLinkStyles getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final String getF2043a() {
            return this.f2043a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) obj;
            return Intrinsics.c(this.f2043a, clickable.f2043a) && Intrinsics.c(this.b, clickable.b) && Intrinsics.c(this.c, clickable.c);
        }

        public final int hashCode() {
            int iHashCode = this.f2043a.hashCode() * 31;
            TextLinkStyles textLinkStyles = this.b;
            int iHashCode2 = (iHashCode + (textLinkStyles != null ? textLinkStyles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = this.c;
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public final String toString() {
            return b.r(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f2043a, ')');
        }
    }

    /* renamed from: a */
    public abstract LinkInteractionListener getC();

    /* renamed from: b */
    public abstract TextLinkStyles getB();

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Url;", "Landroidx/compose/ui/text/LinkAnnotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Url extends LinkAnnotation {

        /* renamed from: a, reason: collision with root package name */
        public final String f2044a;
        public final TextLinkStyles b;

        public Url(String str, TextLinkStyles textLinkStyles) {
            this.f2044a = str;
            this.b = textLinkStyles;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        /* renamed from: a */
        public final LinkInteractionListener getC() {
            return null;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        /* renamed from: b, reason: from getter */
        public final TextLinkStyles getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final String getF2044a() {
            return this.f2044a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return Intrinsics.c(this.f2044a, url.f2044a) && Intrinsics.c(this.b, url.b);
        }

        public final int hashCode() {
            int iHashCode = this.f2044a.hashCode() * 31;
            TextLinkStyles textLinkStyles = this.b;
            return (iHashCode + (textLinkStyles != null ? textLinkStyles.hashCode() : 0)) * 31;
        }

        public final String toString() {
            return b.r(new StringBuilder("LinkAnnotation.Url(url="), this.f2044a, ')');
        }

        public /* synthetic */ Url(String str, TextLinkStyles textLinkStyles, int i) {
            this(str, textLinkStyles);
        }
    }
}
