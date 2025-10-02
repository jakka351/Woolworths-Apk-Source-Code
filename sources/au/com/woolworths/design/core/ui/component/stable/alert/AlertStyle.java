package au.com.woolworths.design.core.ui.component.stable.alert;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/alert/AlertStyle;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AlertStyle {
    public static final AlertStyle d;
    public static final AlertStyle e;
    public static final AlertStyle f;
    public static final AlertStyle g;
    public static final /* synthetic */ AlertStyle[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        AlertStyle alertStyle = new AlertStyle() { // from class: au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle.INFORMATIONAL
            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long a(Composer composer) {
                composer.o(2110619589);
                long j = CoreTheme.b(composer).b.c.b.f4808a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long b(Composer composer) {
                composer.o(238236135);
                long j = CoreTheme.b(composer).b.f4803a.b;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final ImageVector c(Composer composer) {
                composer.o(-2007022304);
                ImageVector imageVector = CoreTheme.e(composer).i.d;
                composer.l();
                return imageVector;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long d(Composer composer) {
                composer.o(1428628221);
                long j = CoreTheme.b(composer).b.b.b;
                composer.l();
                return j;
            }
        };
        d = alertStyle;
        AlertStyle alertStyle2 = new AlertStyle() { // from class: au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle.SUCCESS
            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long a(Composer composer) {
                composer.o(-1548786387);
                long j = CoreTheme.b(composer).b.c.c.f4809a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long b(Composer composer) {
                composer.o(-1769620913);
                long j = CoreTheme.b(composer).b.f4803a.c;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final ImageVector c(Composer composer) {
                composer.o(-1013835000);
                ImageVector imageVector = CoreTheme.e(composer).i.k;
                composer.l();
                return imageVector;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long d(Composer composer) {
                composer.o(1673141349);
                long j = CoreTheme.b(composer).b.b.c;
                composer.l();
                return j;
            }
        };
        e = alertStyle2;
        AlertStyle alertStyle3 = new AlertStyle() { // from class: au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle.WARNING
            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long a(Composer composer) {
                composer.o(-381501829);
                long j = CoreTheme.b(composer).b.c.d.f4810a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long b(Composer composer) {
                composer.o(-602336355);
                long j = CoreTheme.b(composer).b.f4803a.d;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final ImageVector c(Composer composer) {
                composer.o(153449558);
                ImageVector imageVector = CoreTheme.e(composer).i.m;
                composer.l();
                return imageVector;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long d(Composer composer) {
                composer.o(-1454541389);
                long j = CoreTheme.b(composer).b.b.d;
                composer.l();
                return j;
            }
        };
        f = alertStyle3;
        AlertStyle alertStyle4 = new AlertStyle() { // from class: au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle.ERROR
            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long a(Composer composer) {
                composer.o(-624585309);
                long j = CoreTheme.b(composer).b.c.f4806a.f4807a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long b(Composer composer) {
                composer.o(600296389);
                long j = CoreTheme.b(composer).b.f4803a.f4804a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final ImageVector c(Composer composer) {
                composer.o(302739710);
                ImageVector imageVector = CoreTheme.e(composer).i.b;
                composer.l();
                return imageVector;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle
            public final long d(Composer composer) {
                composer.o(-1082349349);
                long j = CoreTheme.b(composer).b.b.f4805a;
                composer.l();
                return j;
            }
        };
        g = alertStyle4;
        AlertStyle[] alertStyleArr = {alertStyle, alertStyle2, alertStyle3, alertStyle4};
        h = alertStyleArr;
        i = EnumEntriesKt.a(alertStyleArr);
    }

    public static AlertStyle valueOf(String str) {
        return (AlertStyle) Enum.valueOf(AlertStyle.class, str);
    }

    public static AlertStyle[] values() {
        return (AlertStyle[]) h.clone();
    }

    public abstract long a(Composer composer);

    public abstract long b(Composer composer);

    public abstract ImageVector c(Composer composer);

    public abstract long d(Composer composer);
}
