package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavInflater;", "", "Companion", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavInflater {
    public static final ThreadLocal c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3485a;
    public final NavigatorProvider b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/navigation/NavInflater$Companion;", "", "", "TAG_ARGUMENT", "Ljava/lang/String;", "TAG_DEEP_LINK", "TAG_ACTION", "TAG_INCLUDE", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/ThreadLocal;", "Landroid/util/TypedValue;", "sTmpValue", "Ljava/lang/ThreadLocal;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static NavType a(TypedValue typedValue, NavType navType, NavType navType2, String str, String str2) throws XmlPullParserException {
            if (navType == null || navType == navType2) {
                return navType == null ? navType2 : navType;
            }
            StringBuilder sbV = YU.a.v("Type is ", str, " but found ", str2, ": ");
            sbV.append(typedValue.data);
            throw new XmlPullParserException(sbV.toString());
        }
    }

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        Intrinsics.h(navigatorProvider, "navigatorProvider");
        this.f3485a = context;
        this.b = navigatorProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.navigation.NavArgument c(android.content.res.TypedArray r20, android.content.res.Resources r21, int r22) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavInflater.c(android.content.res.TypedArray, android.content.res.Resources, int):androidx.navigation.NavArgument");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024b, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.navigation.NavDestination a(android.content.res.Resources r19, android.content.res.XmlResourceParser r20, android.util.AttributeSet r21, int r22) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavInflater.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):androidx.navigation.NavDestination");
    }

    public final NavGraph b(int i) throws Resources.NotFoundException {
        int next;
        Resources resources = this.f3485a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        Intrinsics.g(xml, "getXml(...)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.e(attributeSetAsAttributeSet);
        NavDestination navDestinationA = a(resources, xml, attributeSetAsAttributeSet, i);
        if (navDestinationA instanceof NavGraph) {
            return (NavGraph) navDestinationA;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
