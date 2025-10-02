package com.dynatrace.android.compose;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.api.compose.SemanticsExtensionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dynatrace/android/compose/SemanticsManager;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsManager {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14149a;
    public static SemanticsConfiguration b;

    static {
        boolean z = Global.f14077a;
        f14149a = "dtxSemanticsManager";
    }

    public static String a() {
        String str;
        if (Global.f14077a) {
            if (b == null) {
                str = "onUA: no SemanticsConfiguration value available";
            } else {
                str = "onUA: " + b;
            }
            Utility.h(f14149a, str);
        }
        SemanticsConfiguration semanticsConfiguration = b;
        String strD = semanticsConfiguration != null ? d(semanticsConfiguration) : null;
        b = null;
        return strD;
    }

    public static String b(SemanticsConfiguration semanticsConfiguration) {
        Object next;
        List list = (List) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.f2020a);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((String) next).length() > 0) {
                    break;
                }
            }
            String strC = (String) next;
            if (strC == null) {
                strC = c(semanticsConfiguration);
            }
            if (strC != null) {
                return strC;
            }
        }
        return c(semanticsConfiguration);
    }

    public static String c(SemanticsConfiguration semanticsConfiguration) {
        Object next;
        List list = (List) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.z);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AnnotatedString) next).e.length() > 0) {
                    break;
                }
            }
            AnnotatedString annotatedString = (AnnotatedString) next;
            if (annotatedString != null) {
                return annotatedString.e;
            }
        }
        return null;
    }

    public static String d(SemanticsConfiguration semanticsConfiguration) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsExtensionKt.b;
        MutableScatterMap mutableScatterMap = semanticsConfiguration.d;
        if (!mutableScatterMap.c(semanticsPropertyKey)) {
            if (mutableScatterMap.c(SemanticsProperties.f2020a)) {
                return b(semanticsConfiguration);
            }
            if (mutableScatterMap.c(SemanticsProperties.z)) {
                return c(semanticsConfiguration);
            }
            return null;
        }
        String strB = (String) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey);
        if (strB != null) {
            if (strB.length() == 0) {
                strB = b(semanticsConfiguration);
            }
            if (strB != null) {
                return strB;
            }
        }
        return b(semanticsConfiguration);
    }

    public static String e(Modifier modifier) {
        final SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (modifier != null) {
            modifier.w(Unit.f24250a, new Function2<Unit, Modifier.Element, Unit>() { // from class: com.dynatrace.android.compose.SemanticsManager$fetchSemanticsNameFromModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Modifier.Element element = (Modifier.Element) obj2;
                    Intrinsics.h((Unit) obj, "<anonymous parameter 0>");
                    Intrinsics.h(element, "element");
                    if (element instanceof SemanticsModifier) {
                        SemanticsModifier semanticsModifier = (SemanticsModifier) element;
                        SemanticsConfiguration semanticsConfigurationR = semanticsModifier.R();
                        SemanticsPropertyKey semanticsPropertyKey = SemanticsExtensionKt.b;
                        String str = (String) SemanticsConfigurationKt.a(semanticsConfigurationR, semanticsPropertyKey);
                        if (str != null) {
                            semanticsConfiguration.b(semanticsPropertyKey, str);
                        }
                        List list = (List) SemanticsConfigurationKt.a(semanticsModifier.R(), SemanticsProperties.f2020a);
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        List list2 = (List) SemanticsConfigurationKt.a(semanticsModifier.R(), SemanticsProperties.z);
                        if (list2 != null) {
                            arrayList2.addAll(list2);
                        }
                    }
                    return Unit.f24250a;
                }
            });
        }
        semanticsConfiguration.b(SemanticsProperties.f2020a, arrayList);
        semanticsConfiguration.b(SemanticsProperties.z, arrayList2);
        return d(semanticsConfiguration);
    }
}
