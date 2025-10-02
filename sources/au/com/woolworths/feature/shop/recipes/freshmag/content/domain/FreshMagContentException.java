package au.com.woolworths.feature.shop.recipes.freshmag.content.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ServerException", "NotFoundException", "NoConnectivityException", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentException$NoConnectivityException;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentException$NotFoundException;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentException$ServerException;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FreshMagContentException extends Exception {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentException$NoConnectivityException;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentException;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoConnectivityException extends FreshMagContentException {
        public static final NoConnectivityException d = new NoConnectivityException();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentException$NotFoundException;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentException;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotFoundException extends FreshMagContentException {
        public static final NotFoundException d = new NotFoundException();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentException$ServerException;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentException;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerException extends FreshMagContentException {
        public static final ServerException d = new ServerException();
    }
}
