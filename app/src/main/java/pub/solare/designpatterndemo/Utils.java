package pub.solare.designpatterndemo;

import pub.solare.designpatterndemo.mvc.IVoteView;

public class Utils {

    public static Utils getInstance() {
        return UtilsHolder.sInstance;
    }

    private Utils(){}
    private static final class UtilsHolder {
        public static final Utils sInstance = new Utils();
    }

    private IVoteView mVoteView;

    public void setVoteView(IVoteView voteView) {
        mVoteView = voteView;
    }

    public IVoteView getVoteView() {
        return mVoteView;
    }
}
