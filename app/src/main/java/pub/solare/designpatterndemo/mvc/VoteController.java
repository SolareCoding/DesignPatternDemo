package pub.solare.designpatterndemo.mvc;

public class VoteController implements IVoteController{

    private IVoteModel mVoteModel;

    public VoteController() {
        mVoteModel = new VoteModel();
    }

    public void vote() {
        if (mVoteModel != null) {
            mVoteModel.vote();
        }
    }
}
