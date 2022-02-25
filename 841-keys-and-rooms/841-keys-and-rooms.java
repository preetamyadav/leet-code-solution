class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        this.markVisited(rooms,0);
        return this.isAllVisited(rooms);
    }
    
    private void markVisited(List<List<Integer>> rooms , int roomIndex){
        List<Integer> roomList = rooms.get(roomIndex);
        for(int i =0 ;i < roomList.size();i++){
            int z = roomList.get(i);
            if(z != -1){
                roomList.set(i,-1);
                markVisited(rooms,z);
            }
        }
    }
    
    private boolean isAllVisited(List<List<Integer>> rooms){
        
        for(int i =0; i< rooms.size();i++){
            for(int j =0; j< rooms.get(i).size();j++){
                if(rooms.get(i).get(j) !=-1){
                    return false;
                }
            }
        }
        return true;
    }
}