package com.MyMall.service.impl;


import com.MyMall.dao.CommentsMapper;
import com.MyMall.pojo.CommentsReply;
import com.MyMall.pojo.CommentsRoot;
import com.MyMall.pojo.Liked;
import com.MyMall.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评论的service类，衔接控制层与持久化层
 */
@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    CommentsMapper commentsMapper;

    @Override
    public List<CommentsRoot> findByOwnerIdService(String ownerId) {
        if(ownerId == null || ownerId.equals("")){
            return null;
        }
        return commentsMapper.findByOwnerId(ownerId);
    }

    @Override
    public boolean addRootCommentsService(CommentsRoot commentsRoot) {
        if(commentsRoot == null){
            return false;
        }
        return commentsMapper.addRootComments(commentsRoot);
    }

    @Override
    public boolean addSonCommentsService(CommentsReply commentsReply) {
        if(commentsReply == null){
            return false;
        }
        return commentsMapper.addSonComments(commentsReply);
    }

    @Override
    public boolean addLikedService(Liked liked) {
        if(liked == null)
            return false;
        return commentsMapper.addLiked(liked);
    }

    @Override
    public List<Liked> getListLikedService(String userId) {
        return commentsMapper.getListLiked(userId);
    }

    @Override
    public boolean updateLikedService(Liked liked) {
        return commentsMapper.updateLiked(liked);
    }

    @Override
    public Liked checkedLikeService(Liked liked) {
        return commentsMapper.checkedLike(liked);
    }

    @Override
    public boolean updateRootLikeNumService(Liked liked) {
        return commentsMapper.updateRootLikeNum(liked);
    }

    @Override
    public boolean updateReplyLikeNumService(Liked liked) {
        return commentsMapper.updateReplyLikeNum(liked);
    }
}
