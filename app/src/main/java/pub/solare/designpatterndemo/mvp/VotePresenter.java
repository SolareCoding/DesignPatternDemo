package pub.solare.designpatterndemo.mvp;


public class VotePresenter implements IVoteContract.IVotePresenter, IVoteContract.IVotePresenterCallback {

    private IVoteContract.IVoteModel mVoteModel;
    private IVoteContract.IVoteView mVoteView;

    public VotePresenter(IVoteContract.IVoteView voteView) {
        mVoteView = voteView;
        mVoteModel = new VoteModel(this);
    }

    @Override
    public void vote() {
        if (mVoteModel != null) {
            mVoteModel.vote();
        }
    }

    @Override
    public void onVoteResult() {
        mVoteView.onVoteResult();
    }
}
