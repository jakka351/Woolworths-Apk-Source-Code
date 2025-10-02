package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidFontLoader f2095a;
    public final AndroidFontResolveInterceptor b;
    public final TypefaceRequestCache c;
    public final FontListFontFamilyTypefaceAdapter d;
    public final PlatformFontFamilyTypefaceAdapter e;
    public final Function1 f;

    public FontFamilyResolverImpl(AndroidFontLoader androidFontLoader, AndroidFontResolveInterceptor androidFontResolveInterceptor) {
        TypefaceRequestCache typefaceRequestCache = FontFamilyResolverKt.f2096a;
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.b);
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter = new PlatformFontFamilyTypefaceAdapter();
        this.f2095a = androidFontLoader;
        this.b = androidFontResolveInterceptor;
        this.c = typefaceRequestCache;
        this.d = fontListFontFamilyTypefaceAdapter;
        this.e = platformFontFamilyTypefaceAdapter;
        this.f = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    public final TypefaceResult a(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        AndroidFontResolveInterceptor androidFontResolveInterceptor = this.b;
        androidFontResolveInterceptor.getClass();
        int i3 = androidFontResolveInterceptor.f2091a;
        FontWeight fontWeight2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? fontWeight : new FontWeight(RangesKt.c(fontWeight.d + i3, 1, 1000));
        this.f2095a.getClass();
        return b(new TypefaceRequest(fontFamily, fontWeight2, i, i2, null));
    }

    public final TypefaceResult b(final TypefaceRequest typefaceRequest) {
        final TypefaceRequestCache typefaceRequestCache = this.c;
        Function1<Function1<? super TypefaceResult, ? extends Unit>, TypefaceResult> function1 = new Function1<Function1<? super TypefaceResult, ? extends Unit>, TypefaceResult>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:143:0x0286  */
            /* JADX WARN: Removed duplicated region for block: B:218:0x03bc  */
            /* JADX WARN: Removed duplicated region for block: B:219:0x03c4  */
            /* JADX WARN: Removed duplicated region for block: B:236:0x0421 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:237:0x0422  */
            /* JADX WARN: Removed duplicated region for block: B:255:0x03a6 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 1067
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1.invoke(java.lang.Object):java.lang.Object");
            }
        };
        synchronized (typefaceRequestCache.f2107a) {
            TypefaceResult typefaceResult = (TypefaceResult) typefaceRequestCache.b.get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getE()) {
                    return typefaceResult;
                }
            }
            try {
                TypefaceResult typefaceResult2 = (TypefaceResult) function1.invoke(new Function1<TypefaceResult, Unit>() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        TypefaceResult typefaceResult3 = (TypefaceResult) obj;
                        TypefaceRequestCache typefaceRequestCache2 = typefaceRequestCache;
                        SynchronizedObject synchronizedObject = typefaceRequestCache2.f2107a;
                        TypefaceRequest typefaceRequest2 = typefaceRequest;
                        synchronized (synchronizedObject) {
                            try {
                                if (typefaceResult3.getE()) {
                                    typefaceRequestCache2.b.put(typefaceRequest2, typefaceResult3);
                                } else {
                                    typefaceRequestCache2.b.remove(typefaceRequest2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return Unit.f24250a;
                    }
                });
                synchronized (typefaceRequestCache.f2107a) {
                    if (typefaceRequestCache.b.get(typefaceRequest) == null && typefaceResult2.getE()) {
                        typefaceRequestCache.b.put(typefaceRequest, typefaceResult2);
                    }
                }
                return typefaceResult2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
