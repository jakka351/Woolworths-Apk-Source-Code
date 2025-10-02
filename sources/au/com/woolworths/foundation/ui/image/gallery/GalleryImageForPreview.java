package au.com.woolworths.foundation.ui.image.gallery;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/ui/image/gallery/GalleryImageForPreview;", "Lau/com/woolworths/foundation/ui/image/gallery/ImageCarouselItem;", "image-gallery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GalleryImageForPreview implements ImageCarouselItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f8926a;

    public GalleryImageForPreview(String str) {
        this.f8926a = str;
    }

    @Override // au.com.woolworths.foundation.ui.image.gallery.ImageCarouselItem
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GalleryImageForPreview) && this.f8926a.equals(((GalleryImageForPreview) obj).f8926a);
    }

    @Override // au.com.woolworths.foundation.ui.image.gallery.ImageCarouselItem
    /* renamed from: getImageUrl, reason: from getter */
    public final String getF8926a() {
        return this.f8926a;
    }

    public final int hashCode() {
        return this.f8926a.hashCode() * 31;
    }

    public final String toString() {
        return YU.a.h("GalleryImageForPreview(imageUrl=", this.f8926a, ", altText=null)");
    }
}
