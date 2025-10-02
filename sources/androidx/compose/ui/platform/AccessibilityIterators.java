package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators;", "", "AbstractTextSegmentIterator", "CharacterTextSegmentIterator", "LineTextSegmentIterator", "PageTextSegmentIterator", "ParagraphTextSegmentIterator", "TextSegmentIterator", "WordTextSegmentIterator", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessibilityIterators {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {

        /* renamed from: a, reason: collision with root package name */
        public String f1934a;
        public final int[] b = new int[2];

        public final int[] c(int i, int i2) {
            if (i < 0 || i2 < 0 || i == i2) {
                return null;
            }
            int[] iArr = this.b;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }

        public final String d() {
            String str = this.f1934a;
            if (str != null) {
                return str;
            }
            Intrinsics.p(TextBundle.TEXT_ENTRY);
            throw null;
        }

        public void e(String str) {
            this.f1934a = str;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        public static CharacterTextSegmentIterator d;
        public BreakIterator c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator$Companion;", "", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public static CharacterTextSegmentIterator a(Locale locale) {
                if (CharacterTextSegmentIterator.d == null) {
                    CharacterTextSegmentIterator characterTextSegmentIterator = new CharacterTextSegmentIterator();
                    characterTextSegmentIterator.c = BreakIterator.getCharacterInstance(locale);
                    CharacterTextSegmentIterator.d = characterTextSegmentIterator;
                }
                CharacterTextSegmentIterator characterTextSegmentIterator2 = CharacterTextSegmentIterator.d;
                Intrinsics.f(characterTextSegmentIterator2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return characterTextSegmentIterator2;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] a(int i) {
            int length = d().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            do {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    Intrinsics.p("impl");
                    throw null;
                }
                if (breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.c;
                    if (breakIterator2 == null) {
                        Intrinsics.p("impl");
                        throw null;
                    }
                    int iFollowing = breakIterator2.following(i);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return c(i, iFollowing);
                }
                BreakIterator breakIterator3 = this.c;
                if (breakIterator3 == null) {
                    Intrinsics.p("impl");
                    throw null;
                }
                i = breakIterator3.following(i);
            } while (i != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] b(int i) {
            int length = d().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            do {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    Intrinsics.p("impl");
                    throw null;
                }
                if (breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.c;
                    if (breakIterator2 == null) {
                        Intrinsics.p("impl");
                        throw null;
                    }
                    int iPreceding = breakIterator2.preceding(i);
                    if (iPreceding == -1) {
                        return null;
                    }
                    return c(iPreceding, i);
                }
                BreakIterator breakIterator3 = this.c;
                if (breakIterator3 == null) {
                    Intrinsics.p("impl");
                    throw null;
                }
                i = breakIterator3.preceding(i);
            } while (i != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public final void e(String str) {
            this.f1934a = str;
            BreakIterator breakIterator = this.c;
            if (breakIterator != null) {
                breakIterator.setText(str);
            } else {
                Intrinsics.p("impl");
                throw null;
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        public static LineTextSegmentIterator d;
        public static final ResolvedTextDirection e = ResolvedTextDirection.e;
        public static final ResolvedTextDirection f = ResolvedTextDirection.d;
        public TextLayoutResult c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion;", "", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "lineInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public static LineTextSegmentIterator a() {
                if (LineTextSegmentIterator.d == null) {
                    LineTextSegmentIterator.d = new LineTextSegmentIterator();
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.d;
                Intrinsics.f(lineTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return lineTextSegmentIterator;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] a(int i) {
            int iD;
            if (d().length() <= 0 || i >= d().length()) {
                return null;
            }
            ResolvedTextDirection resolvedTextDirection = e;
            if (i < 0) {
                TextLayoutResult textLayoutResult = this.c;
                if (textLayoutResult == null) {
                    Intrinsics.p("layoutResult");
                    throw null;
                }
                iD = textLayoutResult.b.d(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.c;
                if (textLayoutResult2 == null) {
                    Intrinsics.p("layoutResult");
                    throw null;
                }
                int iD2 = textLayoutResult2.b.d(i);
                iD = f(iD2, resolvedTextDirection) == i ? iD2 : iD2 + 1;
            }
            TextLayoutResult textLayoutResult3 = this.c;
            if (textLayoutResult3 == null) {
                Intrinsics.p("layoutResult");
                throw null;
            }
            if (iD >= textLayoutResult3.b.f) {
                return null;
            }
            return c(f(iD, resolvedTextDirection), f(iD, f) + 1);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] b(int i) {
            int iD;
            if (d().length() <= 0 || i <= 0) {
                return null;
            }
            int length = d().length();
            ResolvedTextDirection resolvedTextDirection = f;
            if (i > length) {
                TextLayoutResult textLayoutResult = this.c;
                if (textLayoutResult == null) {
                    Intrinsics.p("layoutResult");
                    throw null;
                }
                iD = textLayoutResult.b.d(d().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.c;
                if (textLayoutResult2 == null) {
                    Intrinsics.p("layoutResult");
                    throw null;
                }
                int iD2 = textLayoutResult2.b.d(i);
                iD = f(iD2, resolvedTextDirection) + 1 == i ? iD2 : iD2 - 1;
            }
            if (iD < 0) {
                return null;
            }
            return c(f(iD, e), f(iD, resolvedTextDirection) + 1);
        }

        public final int f(int i, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.c;
            if (textLayoutResult == null) {
                Intrinsics.p("layoutResult");
                throw null;
            }
            int iG = textLayoutResult.g(i);
            TextLayoutResult textLayoutResult2 = this.c;
            if (textLayoutResult2 == null) {
                Intrinsics.p("layoutResult");
                throw null;
            }
            if (resolvedTextDirection != textLayoutResult2.h(iG)) {
                TextLayoutResult textLayoutResult3 = this.c;
                if (textLayoutResult3 != null) {
                    return textLayoutResult3.g(i);
                }
                Intrinsics.p("layoutResult");
                throw null;
            }
            if (this.c != null) {
                return r6.b.c(i, false) - 1;
            }
            Intrinsics.p("layoutResult");
            throw null;
        }

        public final void g(String str, TextLayoutResult textLayoutResult) {
            this.f1934a = str;
            this.c = textLayoutResult;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        public static PageTextSegmentIterator e;
        public static final ResolvedTextDirection f = ResolvedTextDirection.e;
        public static final ResolvedTextDirection g = ResolvedTextDirection.d;
        public TextLayoutResult c;
        public SemanticsNode d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion;", "", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "pageInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public static PageTextSegmentIterator a() {
                if (PageTextSegmentIterator.e == null) {
                    PageTextSegmentIterator pageTextSegmentIterator = new PageTextSegmentIterator();
                    new Rect();
                    PageTextSegmentIterator.e = pageTextSegmentIterator;
                }
                PageTextSegmentIterator pageTextSegmentIterator2 = PageTextSegmentIterator.e;
                Intrinsics.f(pageTextSegmentIterator2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return pageTextSegmentIterator2;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] a(int i) {
            int iE;
            if (d().length() <= 0 || i >= d().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.d;
                if (semanticsNode == null) {
                    Intrinsics.p("node");
                    throw null;
                }
                androidx.compose.ui.geometry.Rect rectE = semanticsNode.e();
                int iRound = Math.round(rectE.d - rectE.b);
                if (i <= 0) {
                    i = 0;
                }
                TextLayoutResult textLayoutResult = this.c;
                if (textLayoutResult == null) {
                    Intrinsics.p("layoutResult");
                    throw null;
                }
                int iD = textLayoutResult.b.d(i);
                TextLayoutResult textLayoutResult2 = this.c;
                if (textLayoutResult2 == null) {
                    Intrinsics.p("layoutResult");
                    throw null;
                }
                float f2 = textLayoutResult2.b.f(iD) + iRound;
                TextLayoutResult textLayoutResult3 = this.c;
                if (textLayoutResult3 == null) {
                    Intrinsics.p("layoutResult");
                    throw null;
                }
                if (textLayoutResult3 == null) {
                    Intrinsics.p("layoutResult");
                    throw null;
                }
                if (f2 < textLayoutResult3.b.f(r0.f - 1)) {
                    TextLayoutResult textLayoutResult4 = this.c;
                    if (textLayoutResult4 == null) {
                        Intrinsics.p("layoutResult");
                        throw null;
                    }
                    iE = textLayoutResult4.b.e(f2);
                } else {
                    TextLayoutResult textLayoutResult5 = this.c;
                    if (textLayoutResult5 == null) {
                        Intrinsics.p("layoutResult");
                        throw null;
                    }
                    iE = textLayoutResult5.b.f;
                }
                return c(i, f(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] b(int i) {
            int iE;
            if (d().length() <= 0 || i <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.d;
                if (semanticsNode == null) {
                    Intrinsics.p("node");
                    throw null;
                }
                androidx.compose.ui.geometry.Rect rectE = semanticsNode.e();
                int iRound = Math.round(rectE.d - rectE.b);
                int length = d().length();
                if (length <= i) {
                    i = length;
                }
                TextLayoutResult textLayoutResult = this.c;
                if (textLayoutResult == null) {
                    Intrinsics.p("layoutResult");
                    throw null;
                }
                int iD = textLayoutResult.b.d(i);
                TextLayoutResult textLayoutResult2 = this.c;
                if (textLayoutResult2 == null) {
                    Intrinsics.p("layoutResult");
                    throw null;
                }
                float f2 = textLayoutResult2.b.f(iD) - iRound;
                if (f2 > BitmapDescriptorFactory.HUE_RED) {
                    TextLayoutResult textLayoutResult3 = this.c;
                    if (textLayoutResult3 == null) {
                        Intrinsics.p("layoutResult");
                        throw null;
                    }
                    iE = textLayoutResult3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == d().length() && iE < iD) {
                    iE++;
                }
                return c(f(iE, f), i);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final int f(int i, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.c;
            if (textLayoutResult == null) {
                Intrinsics.p("layoutResult");
                throw null;
            }
            int iG = textLayoutResult.g(i);
            TextLayoutResult textLayoutResult2 = this.c;
            if (textLayoutResult2 == null) {
                Intrinsics.p("layoutResult");
                throw null;
            }
            if (resolvedTextDirection != textLayoutResult2.h(iG)) {
                TextLayoutResult textLayoutResult3 = this.c;
                if (textLayoutResult3 != null) {
                    return textLayoutResult3.g(i);
                }
                Intrinsics.p("layoutResult");
                throw null;
            }
            if (this.c != null) {
                return r6.b.c(i, false) - 1;
            }
            Intrinsics.p("layoutResult");
            throw null;
        }

        public final void g(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
            this.f1934a = str;
            this.c = textLayoutResult;
            this.d = semanticsNode;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static ParagraphTextSegmentIterator c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator$Companion;", "", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public static ParagraphTextSegmentIterator a() {
                if (ParagraphTextSegmentIterator.c == null) {
                    ParagraphTextSegmentIterator.c = new ParagraphTextSegmentIterator();
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.c;
                Intrinsics.f(paragraphTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return paragraphTextSegmentIterator;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] a(int i) {
            int length = d().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (i < length && d().charAt(i) == '\n' && (d().charAt(i) == '\n' || (i != 0 && d().charAt(i - 1) != '\n'))) {
                i++;
            }
            if (i >= length) {
                return null;
            }
            int i2 = i + 1;
            while (i2 < length && !f(i2)) {
                i2++;
            }
            return c(i, i2);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] b(int i) {
            int length = d().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && d().charAt(i - 1) == '\n' && !f(i)) {
                i--;
            }
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            while (i2 > 0 && (d().charAt(i2) == '\n' || (i2 != 0 && d().charAt(i2 - 1) != '\n'))) {
                i2--;
            }
            return c(i2, i);
        }

        public final boolean f(int i) {
            if (i <= 0 || d().charAt(i - 1) == '\n') {
                return false;
            }
            return i == d().length() || d().charAt(i) == '\n';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface TextSegmentIterator {
        int[] a(int i);

        int[] b(int i);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        public static WordTextSegmentIterator d;
        public BreakIterator c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator$Companion;", "", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public static WordTextSegmentIterator a(Locale locale) {
                if (WordTextSegmentIterator.d == null) {
                    WordTextSegmentIterator wordTextSegmentIterator = new WordTextSegmentIterator();
                    wordTextSegmentIterator.c = BreakIterator.getWordInstance(locale);
                    WordTextSegmentIterator.d = wordTextSegmentIterator;
                }
                WordTextSegmentIterator wordTextSegmentIterator2 = WordTextSegmentIterator.d;
                Intrinsics.f(wordTextSegmentIterator2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return wordTextSegmentIterator2;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] a(int i) {
            if (d().length() > 0 && i < d().length()) {
                if (i < 0) {
                    i = 0;
                }
                while (!g(i) && (!g(i) || (i != 0 && g(i - 1)))) {
                    BreakIterator breakIterator = this.c;
                    if (breakIterator == null) {
                        Intrinsics.p("impl");
                        throw null;
                    }
                    i = breakIterator.following(i);
                    if (i == -1) {
                        break;
                    }
                }
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    Intrinsics.p("impl");
                    throw null;
                }
                int iFollowing = breakIterator2.following(i);
                if (iFollowing != -1 && f(iFollowing)) {
                    return c(i, iFollowing);
                }
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] b(int i) {
            int length = d().length();
            if (length > 0 && i > 0) {
                if (i > length) {
                    i = length;
                }
                while (i > 0 && !g(i - 1) && !f(i)) {
                    BreakIterator breakIterator = this.c;
                    if (breakIterator == null) {
                        Intrinsics.p("impl");
                        throw null;
                    }
                    i = breakIterator.preceding(i);
                    if (i == -1) {
                        break;
                    }
                }
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    Intrinsics.p("impl");
                    throw null;
                }
                int iPreceding = breakIterator2.preceding(i);
                if (iPreceding != -1 && g(iPreceding) && (iPreceding == 0 || !g(iPreceding - 1))) {
                    return c(iPreceding, i);
                }
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public final void e(String str) {
            this.f1934a = str;
            BreakIterator breakIterator = this.c;
            if (breakIterator != null) {
                breakIterator.setText(str);
            } else {
                Intrinsics.p("impl");
                throw null;
            }
        }

        public final boolean f(int i) {
            if (i <= 0 || !g(i - 1)) {
                return false;
            }
            return i == d().length() || !g(i);
        }

        public final boolean g(int i) {
            if (i < 0 || i >= d().length()) {
                return false;
            }
            return Character.isLetterOrDigit(d().codePointAt(i));
        }
    }
}
