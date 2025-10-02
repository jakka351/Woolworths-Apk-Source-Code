package kotlin.reflect;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/KClass;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/reflect/KDeclarationContainer;", "Lkotlin/reflect/KAnnotatedElement;", "Lkotlin/reflect/KClassifier;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }

    String B();

    List a();

    int hashCode();

    boolean i();

    boolean isAbstract();

    List o();

    boolean p();

    boolean w();

    String x();

    Object y();

    boolean z(Object obj);
}
