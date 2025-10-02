package com.salesforce.marketingcloud;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class g {
    private static final int b = 23;

    @Nullable
    private static String c;

    @Nullable
    private static String d;

    @Nullable
    private static String e;

    @Nullable
    private static MCLogListener g;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f16896a = new g();
    private static int f = 6;

    public static final class a extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16897a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr) {
            super(0);
            this.f16897a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f16896a;
            String str = this.f16897a;
            Object[] objArr = this.b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16898a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr) {
            super(0);
            this.f16898a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f16896a;
            String str = this.f16898a;
            Object[] objArr = this.b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16899a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr) {
            super(0);
            this.f16899a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f16896a;
            String str = this.f16899a;
            Object[] objArr = this.b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16900a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr) {
            super(0);
            this.f16900a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f16896a;
            String str = this.f16900a;
            Object[] objArr = this.b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<String> f16901a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0<String> function0) {
            super(0);
            this.f16901a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f16901a.invoke() + " - Sdk Version: " + MarketingCloudSdk.getSdkVersionName();
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16902a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr) {
            super(0);
            this.f16902a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f16896a;
            String str = this.f16902a;
            Object[] objArr = this.b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$g, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0359g extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16903a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0359g(String str, Object[] objArr) {
            super(0);
            this.f16903a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f16896a;
            String str = this.f16903a;
            Object[] objArr = this.b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16904a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Object[] objArr) {
            super(0);
            this.f16904a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f16896a;
            String str = this.f16904a;
            Object[] objArr = this.b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes6.dex */
    public static final class i extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16905a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Object[] objArr) {
            super(0);
            this.f16905a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f16896a;
            String str = this.f16905a;
            Object[] objArr = this.b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes6.dex */
    public static final class j extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16906a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, Object[] objArr) {
            super(0);
            this.f16906a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f16896a;
            String str = this.f16906a;
            Object[] objArr = this.b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes6.dex */
    public static final class k extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16907a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Object[] objArr) {
            super(0);
            this.f16907a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f16896a;
            String str = this.f16907a;
            Object[] objArr = this.b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    private g() {
    }

    @JvmName
    public final void a(@NotNull String tag, @Nullable Throwable th, @NotNull Function0<String> lazyMsg) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(lazyMsg, "lazyMsg");
        a(3, tag, th, lazyMsg);
    }

    @JvmName
    public final void b(@NotNull String tag, @Nullable Throwable th, @NotNull Function0<String> lazyMsg) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(lazyMsg, "lazyMsg");
        a(6, tag, th, new e(lazyMsg));
    }

    @JvmName
    public final void c(@NotNull String tag, @Nullable Throwable th, @NotNull Function0<String> lazyMsg) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(lazyMsg, "lazyMsg");
        a(4, tag, th, lazyMsg);
    }

    @JvmName
    public final void d(@NotNull String tag, @Nullable Throwable th, @NotNull Function0<String> lazyMsg) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(lazyMsg, "lazyMsg");
        a(2, tag, th, lazyMsg);
    }

    @JvmName
    public final void e(@NotNull String tag, @Nullable Throwable th, @NotNull Function0<String> lazyMsg) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(lazyMsg, "lazyMsg");
        a(5, tag, th, lazyMsg);
    }

    public static /* synthetic */ void a(g gVar, String str, Throwable th, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        gVar.a(str, th, (Function0<String>) function0);
    }

    public static /* synthetic */ void b(g gVar, String str, Throwable th, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        gVar.b(str, th, (Function0<String>) function0);
    }

    public static /* synthetic */ void c(g gVar, String str, Throwable th, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        gVar.c(str, th, (Function0<String>) function0);
    }

    public static /* synthetic */ void d(g gVar, String str, Throwable th, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        gVar.d(str, th, (Function0<String>) function0);
    }

    public static /* synthetic */ void e(g gVar, String str, Throwable th, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        gVar.e(str, th, (Function0<String>) function0);
    }

    @Deprecated
    @JvmStatic
    public static final void b(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(msg, "msg");
        Intrinsics.h(args, "args");
        b(f16896a, tag, null, new c(msg, args), 2, null);
    }

    @Deprecated
    @JvmStatic
    public static final void c(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(msg, "msg");
        Intrinsics.h(args, "args");
        c(f16896a, tag, null, new f(msg, args), 2, null);
    }

    @Deprecated
    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(msg, "msg");
        Intrinsics.h(args, "args");
        d(f16896a, tag, null, new h(msg, args), 2, null);
    }

    @Deprecated
    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(msg, "msg");
        Intrinsics.h(args, "args");
        e(f16896a, tag, null, new j(msg, args), 2, null);
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull String tag) {
        Intrinsics.h(tag, "tag");
        return f16896a.c(tag);
    }

    @Deprecated
    @JvmStatic
    public static final void b(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(throwable, "throwable");
        Intrinsics.h(msg, "msg");
        Intrinsics.h(args, "args");
        f16896a.b(tag, throwable, new d(msg, args));
    }

    @Deprecated
    @JvmStatic
    public static final void c(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(throwable, "throwable");
        Intrinsics.h(msg, "msg");
        Intrinsics.h(args, "args");
        f16896a.c(tag, throwable, new C0359g(msg, args));
    }

    @Deprecated
    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(throwable, "throwable");
        Intrinsics.h(msg, "msg");
        Intrinsics.h(args, "args");
        f16896a.d(tag, throwable, new i(msg, args));
    }

    @Deprecated
    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(throwable, "throwable");
        Intrinsics.h(msg, "msg");
        Intrinsics.h(args, "args");
        f16896a.e(tag, throwable, new k(msg, args));
    }

    @Deprecated
    @JvmStatic
    public static final void a(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(msg, "msg");
        Intrinsics.h(args, "args");
        a(f16896a, tag, null, new a(msg, args), 2, null);
    }

    private final String b(String str) {
        if (TextUtils.getTrimmedLength(str) == 0) {
            return "Log message was empty";
        }
        String str2 = c;
        if (str2 != null) {
            str = StringsKt.Q(str, str2, "████████-████-████-████-████████████", false);
        }
        String str3 = d;
        if (str3 != null) {
            str = StringsKt.Q(str, str3, "███████████████████████", false);
        }
        String str4 = e;
        return str4 != null ? StringsKt.Q(str, str4, "████████", false) : str;
    }

    private final String c(String str) {
        if (!StringsKt.o(str, "~!", false)) {
            str = "~!".concat(str);
        }
        return str.length() <= 23 ? str : str.subSequence(0, 23).toString();
    }

    @Deprecated
    @JvmStatic
    public static final void a(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(throwable, "throwable");
        Intrinsics.h(msg, "msg");
        Intrinsics.h(args, "args");
        f16896a.a(tag, throwable, new b(msg, args));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(String str, Object... objArr) {
        Locale locale = Locale.ENGLISH;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Nullable
    public final MCLogListener a() {
        return g;
    }

    private final void a(int i2, String str, Throwable th, Function0<String> function0) {
        MCLogListener mCLogListener = g;
        if (mCLogListener == null || i2 < f) {
            return;
        }
        try {
            mCLogListener.out(i2, c(str), b((String) function0.invoke()), th);
        } catch (Exception e2) {
            Log.e("~!Logger", "Exception was thrown by ".concat(mCLogListener.getClass().getName()), e2);
        }
    }

    public final void a(@Nullable MCLogListener mCLogListener) {
        g = mCLogListener;
    }

    public final void a(int i2) {
        f = i2;
    }

    public final int b() {
        return f;
    }

    @JvmStatic
    public static final void a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        c = str;
        d = str2;
        e = str3;
    }
}
