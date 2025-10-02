package au.com.woolworths.feature.shop.catalogue.details;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "NoConnectivityException", "ServerException", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsException$NoConnectivityException;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsException$ServerException;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueDetailsException extends Exception {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsException$NoConnectivityException;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsException;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoConnectivityException extends CatalogueDetailsException {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsException$ServerException;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsException;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerException extends CatalogueDetailsException {
    }
}
