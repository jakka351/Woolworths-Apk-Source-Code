package androidx.recyclerview.widget;

/* loaded from: classes2.dex */
interface ViewTypeStorage {

    public static class IsolatedViewTypeStorage implements ViewTypeStorage {

        public class WrapperViewTypeLookup implements ViewTypeLookup {
        }
    }

    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {

        public class WrapperViewTypeLookup implements ViewTypeLookup {
        }
    }

    public interface ViewTypeLookup {
    }
}
